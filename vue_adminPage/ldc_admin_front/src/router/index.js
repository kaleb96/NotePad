import Vue from 'vue'

// vue-router 라이브러리 선언
import Router from 'vue-router'

Vue.use(Router)

/* 사용할 컴포넌트 import */
import Main from '@/views/Main'

var router = new Router({

    routes:[ 
    
    {
        path: '/',
        name: 'Main',
        component: Main
    },   
    ]
})

// var router = new Router({
    
//     routes: 
//         {
//             path: '/',
//             name: 'Main',
//             component: Main
//         },   

// });

export default router;
