<template>
  <div>
    <img style="width: 450px; height: 400px" :src="selectedImage" />
  </div>
</template>
<script>
export default {
  props: ['selectedImage'],
};
</script>
