<template>
    <User />

    <router-view/>
</template>

<script>
import User from '@/components/User.vue'
export default {
    name: 'App',
    components: {
        User
    }
}
</script>

<style>
body {
    margin: 0;
    font-family: Calibri, sans-serif;
}



input {
    border: 0;
    border-radius: 8py;
    width: 100%;
    height: 30px;
}
</style>
