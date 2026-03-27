<template>
  <div>
    <h3>자식 숫자 : {{ count }}</h3>
    <button @click="increase">증가</button>
  </div>
</template>
<script setup>
import { ref } from 'vue';
const props = defineProps({ initCount: { type: Number, default: 5 } });

const count = ref(props.initCount);

const emit = defineEmits(['update-count']);
const increase = () => {
  count.value++;
  emit('update-count', count.value);
};
</script>
