<template>
  <div>
    <p>Theme: {{ theme }}</p>
  </div>
</template>
<script>
export default {
  inject: ['theme'],
};
</script>
