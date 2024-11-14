<template>
    <div class="modal">
        <div class="modal-content">
            <h2>Anmelden</h2>
            <input v-model="email" type="email" placeholder="E-Mail">
            <input v-model="password" type="password" placeholder="Passwort">
            <button @click="login">Einloggen</button>
            <button @click="$emit('close')">Schließen</button>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            email: '',
            password: ''
        };
    },
    methods: {
        login() {
            alert(`Willkommen, ${this.email}!`);
            this.$emit('close');
        }
    }
};
</script>
