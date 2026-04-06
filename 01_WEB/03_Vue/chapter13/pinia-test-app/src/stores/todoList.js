import { defineStore } from 'pinia';
import { reactive, computed } from 'vue';
export const useTodoListStore = defineStore('todoList', () => {
  // 방응형 상태
  const state = reactive({
    todoList: [
      { id: 1, todo: 'ES6학습', done: false },
      { id: 2, todo: 'React학습', done: false },
      { id: 3, todo: 'ContextAPI 학습', done: true },
      { id: 4, todo: '야구경기 관람', done: false },
    ],
  });

  // action
  const addTodo = (todo) => {
    state.todoList.push({ id: new Date().getTime(), todo, done: false });
  };
  const deleteTodo = (id) => {
    let index = state.todoList.findIndex((todo) => todo.id === id);
    state.todoList.splice(index, 1);
  };
  const toggleDone = (id) => {
    let index = state.todoList.findIndex((todo) => todo.id === id);
    state.todoList[index].done = !state.todoList[index].done;
  };

  // 계산된 속성
  const doneCount = computed(() => {
    return state.todoList.filter((todoItem) => todoItem.done === true).length;
  });
  const todoList = computed(() => state.todoList);

  // 데이터 속성을 보낼 때는 읽기 전용으로 보내야한다. (외부에서 고칠 수 있기 때문)
  return { todoList, doneCount, addTodo, deleteTodo, toggleDone };
});
