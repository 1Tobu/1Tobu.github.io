<template>
    <Header></Header>
    <router-view/>
</template>

<script>
import Header from '@/components/Header.vue'
export default {
    components: {
        Header
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
