import { createApp } from 'vue';
import App from './App.vue';
import AppRef from './AppRef.vue';
import AppRef2 from './AppRef2.vue';
import AppReactive from './AppReactive.vue';
import AppScriptSetup from './AppScriptSetup.vue';
import AppEvent from './AppEvent.vue';

// createApp(App).mount('#app')
// createApp(AppRef).mount('#app');
// createApp(AppRef2).mount('#app');
// createApp(AppReactive).mount('#app');
// createApp(AppScriptSetup).mount('#app');
createApp(AppEvent).mount('#app');
