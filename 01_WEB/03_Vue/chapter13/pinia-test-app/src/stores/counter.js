import { ref, computed } from 'vue';
import { defineStore } from 'pinia';

export const useCounterStore = defineStore('counter', () => {
  const count = ref(0);
  const doubleCount = computed(() => count.value * 2);
  function increment() {
    count.value++;
  }

  // count -> 비권장(외부에서 고칠 수 있기 때문)
  return { count, doubleCount, increment };
});
