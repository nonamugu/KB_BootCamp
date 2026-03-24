<script>
import CheckboxItem from './components/CheckboxItem.vue';

export default {
  name: 'App',
  components: { CheckboxItem },
  data() {
    return {
      idols: [
        { id: 1, name: 'BTS', checked: true },
        { id: 2, name: 'Black Pink', checked: false },
        { id: 3, name: 'EXO', checked: false },
        { id: 4, name: 'ITZY', checked: false },
      ],
    };
  },
};
</script>
<template>
  <div>
    <h2>관심있는 K-POP 가수?</h2>
    <hr />
    <ul>
      <CheckboxItem :name="idols[0].name" :checked="idols[0].checked" />
      <CheckboxItem :name="idols[1].name" :checked="idols[1].checked" />
      <CheckboxItem :name="idols[2].name" :checked="idols[2].checked" />
      <CheckboxItem :name="idols[3].name" :checked="idols[3].checked" />
    </ul>
  </div>
</template>

<style></style>
