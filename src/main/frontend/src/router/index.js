import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import LogInView from '../views/LogInView.vue'
import SignInView from '../views/SignInView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'login',
      component: LogInView
    },
    {
      path: '/signin',
      name: 'signin',
      component: ()=> import('../views/SignInView.vue')
    },
   
    {
      path: '/ProfileUser',
      name: 'ProfileUser',
      component: () => import('../views/ProfileUserView.vue')
    },
    {
      path: '/ElMuro',
      name: 'ElMuro',
      component: () => import('../views/ElMuroView.vue')

    }
    
  ]
})

export default router
