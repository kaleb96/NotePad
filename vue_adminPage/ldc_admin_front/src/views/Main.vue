<!-- 최상위 컴포넌트 -->

<template>
    <div style="height:98%">
        <Header/>
            <router-view/>
        <Sidebar/>
        <Footer/>
    </div>
</template>

<script>

import Header from '@/components/views/header.vue'
import Footer from '@/components/views/footer.vue'
import Sidebar from '@/components/views/sidebar.vue'

export default {
    name: "demo-layout-top-sider-header",
    components : { Header, Footer, Sidebar },
    data: function() {
        return {
            
        }
    }

}

</script>
