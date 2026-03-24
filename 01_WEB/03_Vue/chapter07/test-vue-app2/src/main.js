import { createApp } from 'vue';
import App from './App.vue';
import CheckboxItem from './components/CheckboxItem.vue';

createApp(App).component('checkboxItem', CheckboxItem).mount('#app');
