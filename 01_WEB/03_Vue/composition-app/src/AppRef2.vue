<template>
  <div>
    국어 : <input type="text" v-model.number="kor" /> <br />
    수학 : <input type="text" v-model.number="math" /><br />
    영어 : <input type="text" v-model.number="eng" /><br />
    <h2>총점 : {{ total }}</h2>
  </div>
</template>
<script>
import { computed, ref } from 'vue';
export default {
  setup() {
    const kor = ref(0);
    const math = ref(0);
    const eng = ref(0);
    const total = computed(() => kor.value + math.value + eng.value);

    return { kor, math, eng, total };
  },
};
</script>
