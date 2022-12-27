<template>
    <Post :postdata="postdata[i]" v-for="(a, i) in postdata" :key="i"/>
</template>

<script>

import Post from './Post.vue';

export default {
    name: 'Container',
    props: {
        postdata : Array,
    },
    components : {
        Post,
    }

}
</script>

<style>

</style>