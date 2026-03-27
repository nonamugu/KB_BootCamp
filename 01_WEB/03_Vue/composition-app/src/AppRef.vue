<template>
  <div>
    <!-- 증가와 감소 버튼 작성 -->
    <h3>Count : {{ count }}</h3>
    <button @click="increment">증가</button>
    <button @click="descrement">감소</button>
  </div>
</template>
<script>
import { ref } from 'vue';
export default {
  setup() {
    const count = ref(0);
    const increment = () => {
      count.value++;
    };
    const descrement = () => {
      count.value--;
    };

    return { count, increment, descrement };
  },
};
</script>
