import { createApp } from 'vue'
import App from './App.vue'
// 라이브러리 import
import mitt from 'mitt'

//emitter의 전역 변수형식의 선언
let emitter =mitt();
let app = createApp(App)
app.config.globalProperties.emitter = emitter;

app.mount('#app')
