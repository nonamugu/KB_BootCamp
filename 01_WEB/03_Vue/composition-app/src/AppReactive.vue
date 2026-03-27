<template>
  <div>
    국어 : <input type="text" v-model.number="score.korean" /> <br />
    수학 : <input type="text" v-model.number="score.math" /><br />
    영어 : <input type="text" v-model.number="score.english" /><br />
    <h2>총점 : {{ total }}</h2>
  </div>
</template>
<script>
import { computed, reactive } from 'vue';
export default {
  setup() {
    const score = reactive({ korean: 0, math: 0, english: 0 });
    const total = computed(() => score.korean + score.math + score.english);

    return { score, total };
  },
};
</script>
