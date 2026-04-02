<template>
  <div></div>
</template>
<script setup>
import axios from 'axios';

const requestAPI = async () => {
  let data = { todo: '윗몸일으키기 3세트', desc: '너무 빠르지 않게...' };
  axios
    .post('/api/todos', data)
    .then((response) => {
      console.log(response.data);
    })
    .catch((e) => {
      console.log(e.data);
    });

  axios
    .get('/api/todos')
    .then((response) => {
      console.log(response.data);
    })
    .catch((e) => {
      console.log(e);
    });
};

requestAPI();
</script>
