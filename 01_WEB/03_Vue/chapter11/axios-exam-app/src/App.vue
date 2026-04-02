<template>
  <h1>사용자 관리</h1>
  <input v-model="name" placeholder="사용자 이름" />
  <button @click="addUser">추가</button>
  <button @click="listUsers">목록</button>
  <ul>
    <li v-for="user in users" :key="user.id">
      {{ user.id }} / {{ user.name }}
      <button @click="deleteUser(user.id)">삭제</button>
    </li>
  </ul>
</template>
<script setup>
import axios from 'axios';
import { ref, reactive } from 'vue';

const name = ref('');
const users = reactive([]);

const addUser = async () => {
  if (!name.value) return;

  const res = await axios.post('/api/users', { name: name.value });
  users.push(res.data);
  name.value = '';
};

const listUsers = async () => {
  const res = await axios.get('/api/users');
  users.splice(0, users.length, ...res.data);
};

const deleteUser = async (id) => {
  await axios.delete(`/api/users/${id}`);

  const index = users.findIndex((user) => user.id === id);
  if (index !== -1) users.splice(index, 1);
};
</script>

<style scoped>
button {
  margin-left: 10px;
}
</style>
