import { createApp } from 'vue'
import { createPinia } from 'pinia'
import axios from "axios";

import App from './App.vue'
import router from './router'

import './scss/main.scss'

axios.defaults.baseURL = 'https://localhost:8080/api'

const app = createApp(App)

app.use(createPinia())
app.use(router)

app.mount('#app')
