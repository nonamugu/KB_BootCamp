import Home from '@/pages/Home.vue';
import PostDetail from '@/pages/PostDetail.vue';
import { createRouter, createWebHistory } from 'vue-router';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: '/', component: Home },
    { path: '/post/:id', component: PostDetail },
  ],
});

export default router;
