<template>
  <div class="card card-body">
    <h2 class="text-center">About</h2>
    <p>요청 경로 : {{ $route.fullPath }}</p>
  </div>
</template>
<script>
export default {
  name: 'About',
  created() {
    console.log(this.$route);
  },
};
</script>
