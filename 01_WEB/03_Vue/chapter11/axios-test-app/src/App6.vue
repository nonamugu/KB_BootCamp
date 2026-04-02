<template>
  <div></div>
</template>

<script setup>
import axios from 'axios';

const requestAPI = () => {
  axios
    .get('/api/todos2', { timeout: 900 })
    .then((response) => {
      console.log(response.data);
    })
    .catch((e) => {
      console.log('에러 ~~~~');
      if (e instanceof Error) console.log(e.message);
      else console.log(e);
    });
};

requestAPI();
</script>
