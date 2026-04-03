<template>
  <div class="row">
    <div class="col p-3">
      <h2>할일 추가</h2>
    </div>
  </div>
  <div class="row">
    <div class="col">
      <div class="form-group">
        <label htmlFor="todo">할일 :</label>
        <input
          type="text"
          class="form-control"
          id="todo"
          v-model="todoItem.todo"
        />
      </div>
      <div class="form-group">
        <label htmlFor="desc">설명 :</label>
        <textarea
          class="form-control"
          rows="3"
          id="desc"
          v-model="todoItem.desc"
        ></textarea>
      </div>
    </div>
    <div class="form-group">
      <button
        type="button"
        class="btn btn-primary m-1"
        @click="updateTodoHandler"
      >
        수 정
      </button>
      <button
        type="button"
        class="btn btn-primary m-1"
        @click="router.push('/todos')"
      >
        취 소
      </button>
    </div>
  </div>
</template>

<script setup>
import { inject, reactive } from 'vue';
import { useRoute, useRouter } from 'vue-router';

const todoList = inject('todoList');
const { updateTodo } = inject('actions');
const router = useRouter();
const currentRoute = useRoute();

const matchedTodoItem = todoList.value.find(
  (item) => item.id === currentRoute.params.id,
);
if (!matchedTodoItem) {
  // 404에러가 날때 alert해도 되지만 그냥 페이지 이동
  router.push('/todos');
}

// 수정을 하다가 나갈 때 reactive(matchedTodoItem)을 하게 되면 원본 자체를 수정하다가 나가기에 다시 되돌려야함
// 그것을 방지하기 위해 reative({ ...matchedTodoItem })으로 사용
const todoItem = reactive({ ...matchedTodoItem });

const updateTodoHandler = () => {
  let { todo } = todoItem;
  if (!todo || todo.trim() === '') {
    alert('항릴은 반드시 입력해야 합니다.');
    return;
  }
  updateTodo({ ...todoItem }, () => {
    router.push('/todos');
  });
};
</script>
