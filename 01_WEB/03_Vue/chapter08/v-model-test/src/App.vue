<script>
import InputName from './components/InputName.vue';

export default {
  data() {
    return {
      searchName: 'John',
    };
  },
  components: {
    InputName,
  },
};
</script>

<template>
  <div>
    <InputName v-model:name="searchName" />
    <h3>검색어 : {{ searchName }}</h3>
  </div>
</template>

<style scoped></style>
