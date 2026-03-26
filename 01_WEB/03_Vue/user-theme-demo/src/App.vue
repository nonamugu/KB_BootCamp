<template>
  <div>
    <h3>App</h3>
    <p>현재 사용자 : {{ username }}</p>
    <hr />
    <UserForm v-model:username="username" />
    <hr />
    <UserPanel />
  </div>
</template>

<script>
import UserPanel from './components/UserPanel.vue';
import UserForm from './components/UserForm.vue';

export default {
  components: { UserPanel, UserForm },
  data() {
    return {
      username: '홍길동',
      theme: 'dark',
    };
  },
  provide() {
    return {
      theme: this.theme,
    };
  },
};
</script>
