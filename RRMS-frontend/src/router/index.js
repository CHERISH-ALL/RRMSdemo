import {createRouter, createWebHistory} from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [{
    path: '/',
    name: 'welcome',
    component: () => import('@/views/welcomeView.vue'),
    children: [{
      path: '',
      name: 'welcomeLogin',
      component: () => import('@/components/welcome/loginPage.vue'),
    }]
  }, {
    path: '/index',
    name: 'index',
    component: () => import('@/views/indexView.vue')
  }
  ]
})

export default router
