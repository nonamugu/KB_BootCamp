<template>
  <div class="container">
    <div class="card card-body bg-light">
      <div classe="title">:: Todolist App</div>
    </div>
    <div class="card card-default card-borderless">
      <div class="card-body">
        <InputTodo @add-todo="addTodo"></InputTodo>
        <TodoList
          :todoList="state.todoList"
          @delete-todo="deleteTodo"
          @toggle-completed="toggleCompleted"
        ></TodoList>
      </div>
    </div>
  </div>
</template>
<script setup>
import { reactive, onMounted } from 'vue';
import InputTodo from './components/InputTodo.vue';
import TodoList from './components/TodoList.vue';

const ts = new Date().getTime();
// const todoList = reacticve([]); 로 사용 가능하지만 서버로부터 새로운 배열을 받아오는 경우에 직접 지정해 버리면
// const 이기 때문에 직접적으로 todoList = new Arr 할 수 없음 (반응형이 사라지기 때문)
const state = reactive({ todoList: [] });
onMounted(() => {
  state.todoList.push({ id: ts, todo: '자전거 타기', completed: false });
  state.todoList.push({
    id: ts + 1,
    todo: '딸과 공원 산책',
    completed: true,
  });
  state.todoList.push({
    id: ts + 2,
    todo: '일요일 애견 카페',
    completed: false,
  });
  state.todoList.push({
    id: ts + 3,
    todo: 'Vue 원고 집필',
    completed: false,
  });
});
const addTodo = (todo) => {
  if (todo.length >= 2) {
    state.todoList.push({
      id: new Date().getTime(),
      todo: todo,
      completed: false,
    });
  }
};
const deleteTodo = (id) => {
  let index = state.todoList.findIndex((item) => id === item.id);
  state.todoList.splice(index, 1);
};
const toggleCompleted = (id) => {
  let index = state.todoList.findIndex((item) => id === item.id);
  state.todoList[index].completed = !state.todoList[index].completed;
};
</script>

<style scoped>
header {
  line-height: 1.5;
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

@media (min-width: 1024px) {
  header {
    display: flex;
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
  }

  .logo {
    margin: 0 2rem 0 0;
  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }
}
</style>
