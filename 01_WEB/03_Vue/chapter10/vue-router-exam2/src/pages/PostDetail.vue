<template>
  <h1>게시물 상세 목록</h1>
  <h3>ID : {{ route.params.id }}</h3>
</template>

<script setup>
import { useRoute } from 'vue-router';

const route = useRoute();
</script>
