<template>
    <header>
        <h1>Bewertungsseite</h1>
        <div class="auth-buttons">
            <button @click="$emit('show-login')">Anmelden</button>
            <button @click="$emit('show-register')">Registrieren</button>
        </div>
    </header>
</template>

<script>
export default {
    name: 'Header'
};
</script>

<style scoped>
header {
    width: 100%;
    background-color: #007BFF;
    color: white;
    padding: 10px;
    display: flex;
    justify-content: space-between;
    align-items: center;
}
</style>
