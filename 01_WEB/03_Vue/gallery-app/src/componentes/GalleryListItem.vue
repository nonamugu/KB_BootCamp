<template>
  <img
    style="width: 80px; cursor: pointer"
    :src="image.url"
    @click="handleClick"
  />
</template>
<script>
export default {
  data() {
    return {
      checked: false,
    };
  },
  props: ['image', 'selectId'],
  methods: {
    handleClick() {
      this.$emit('select', this.image);
    },
  },
};
</script>
<style>
.selectBorder {
  border: 2px solid red;
}
.border {
  border: 2px solid gray;
}
</style>
