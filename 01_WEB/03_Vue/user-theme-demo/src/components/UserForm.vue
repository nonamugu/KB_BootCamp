<template>
  <div>
    <h3>UserForm</h3>
    <label>사용자 이름 입력 : </label>
    <input
      type="text"
      :value="username"
      @input="$emit('update:username', $event.target.value)"
    />
  </div>
</template>

<script>
export default {
  props: {
    username: String,
  },
};
</script>
