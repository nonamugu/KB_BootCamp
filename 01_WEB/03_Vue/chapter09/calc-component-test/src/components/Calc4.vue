<template>
  <div>X : <input type="text" v-model.number="state.x" /></div>
  <div>Y : <input type="text" v-model.number="state.y" /></div>
  <div>결과 : {{ result }}</div>
</template>
<script>
import { reactive, computed } from 'vue';

export default {
  setup() {
    const state = reactive({ x: 10, y: 20 });

    const result = computed(() => {
      return state.x + state.y;
    });
    return { state, result };
  },
};
</script>
