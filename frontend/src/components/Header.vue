<template>
    <header>
        <input placeholder="Suche...">
    </header>
</template>

<script>
    export default {
        name: 'Header',
    }
</script>

<style scoped>
header {
    background-color: #F4BC39;
    height: 100px;
    padding: 16px;
    display: flex;
    align-items: flex-end;
    border-bottom-left-radius: 10px;
    border-bottom-right-radius: 10px;
}
</style>