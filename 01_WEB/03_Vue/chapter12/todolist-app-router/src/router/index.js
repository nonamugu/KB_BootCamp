import { createRouter, createWebHistory } from 'vue-router';
import Home from '@/pages/Home.vue';
import About from '@/pages/About.vue';
import TodoList from '@/pages/TodoList.vue';
import AddTodo from '@/pages/AddTodo.vue';
import EditTodo from '@/pages/EditTodo.vue';
import NotFound from '@/pages/NotFound.vue';

const router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: '/', redirect: 'todos' },
    // { path: '/', component: Home },
    { path: '/home', component: Home },
    { path: '/about', component: About },

    // 밑에 방법으로 해는게 더 좋음 페이지가 여러개거나 참조할 컴포넌트가 많을 때
    { path: '/todos', component: TodoList },
    // { path: '/todos', component: () => import('@/pages/TodoList.vue') },

    { path: '/todos/add', component: AddTodo },
    { path: '/todos/edit/:id', component: EditTodo },
    { path: '/:paths(.*)*', component: NotFound },
  ],
});

export default router;
