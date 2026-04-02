<!-- <template>
  <div>
    <h1>게시물 목록</h1>
    <ul>
      <li><router-link to="/post/1">1번 글</router-link></li>
      <li><router-link to="/post/2">2번 글</router-link></li>
      <li><router-link to="/post/3">3번 글</router-link></li>
    </ul>
  </div>
</template> -->

<!-- 동적 바인딩 :to 사용-->
<template>
  <div>
    <h1>게시물 목록</h1>
    <ul>
      <li v-for="post in posts" :key="post.id">
        <router-link :to="`/post/${post.id}`">{{ post.id }}번 글</router-link>
      </li>
    </ul>
  </div>
</template>
<script setup>
import { ref } from 'vue';
const posts = ref([{ id: 1 }, { id: 2 }, { id: 3 }]);
</script>

<!--
동적 바인딩 ?
- Vue에서 :를 붙이는 것을 동적 바인딩(Dynamic Binding) 이라고 부른다.
- HTML 속성에 정적인 문자열이 아니라 자바스크립트 표현식을 연결한다는 뜻이다.
-->
