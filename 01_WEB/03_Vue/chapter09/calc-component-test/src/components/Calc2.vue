<template>
  <div>X : <input type="text" v-model.number="x" /></div>
  <div>Y : <input type="text" v-model.number="y" /></div>
  <button @click="calcAdd">계산</button>
  <div>결과 : {{ result }}</div>
</template>
<script>
import { ref } from 'vue';

export default {
  setup() {
    const x = ref(10);
    const y = ref(20);
    const result = ref(30);

    const calcAdd = () => {
      result.value = x.value + y.value;
    };
    return { x, y, result, calcAdd };
  },
};
</script>
