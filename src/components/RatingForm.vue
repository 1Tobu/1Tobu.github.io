<template>
    <div class="rating-form">
        <input v-model="name" placeholder="Name der Person" />
        <input v-model.number="stars" type="number" placeholder="Bewertung (1-5)" min="1" max="5" />
        <button @click="submitRating">Bewertung hinzufügen</button>
    </div>
</template>

<script>
export default {
    data() {
        return {
            name: '',
            stars: 1
        };
    },
    methods: {
        submitRating() {
            if (this.name && this.stars >= 1 && this.stars <= 5) {
                this.$emit('add-rating', { name: this.name, stars: this.stars });
                this.name = '';
                this.stars = 1;
            } else {
                alert("Bitte einen Namen und eine Bewertung zwischen 1 und 5 eingeben.");
            }
        }
    }
};
</script>
