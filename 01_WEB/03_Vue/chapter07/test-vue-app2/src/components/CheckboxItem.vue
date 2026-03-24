<template>
  <li><input type="checkbox" :chekced="checked" />{{ name }}</li>
</template>

<script>
export default {
  name: 'CheckboxItem',
  props: ['name', 'checked'],
};
</script>
