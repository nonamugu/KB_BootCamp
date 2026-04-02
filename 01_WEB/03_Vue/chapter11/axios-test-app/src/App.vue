<script setup>
import axios from 'axios';
const requestAPI = () => {
  // vite config.js에서 설정
  // "http://localhost:3000/todos/1";
  axios.get('/api/todos/1').then((response) => {
    console.log('# 응답객체 : ', response);
  });
};

requestAPI();
</script>

<template>
  <h1>You did it!</h1>
  <p>
    Visit
    <a href="https://vuejs.org/" target="_blank" rel="noopener">vuejs.org</a> to
    read the documentation
  </p>
</template>

<style scoped></style>
