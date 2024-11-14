<template>
    <div class="modal">
        <div class="modal-content">
            <h2>Registrieren</h2>
            <input v-model="email" type="email" placeholder="E-Mail">
            <input v-model="password" type="password" placeholder="Passwort">
            <button @click="register">Registrieren</button>
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
        register() {
            alert(`Registrierung erfolgreich für: ${this.email}`);
            this.$emit('close');
        }
    }
};
</script>
