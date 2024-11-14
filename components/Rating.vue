<template>
    <div>
        <p>Wie gut war das?</p>
        <div class="stars">
            <span @click="setRating(1)">★</span>
            <span @click="setRating(2)">★</span>
            <span @click="setRating(3)">★</span>
            <span @click="setRating(4)">★</span>
            <span @click="setRating(5)">★</span>
        </div>
        <p>Deine Bewertung: {{ rating }}</p>
    </div>
</template>

<script>
export default {
    data() {
        return {
            rating: 0
        }
    },
    methods: {
        setRating(value) {
            this.rating = value;
            // Hier könntest du die Bewertung an einen Server senden
        }
    }
}
</script>

<style scoped>
.stars span {
    font-size: 24px;
    cursor: pointer;
}
</style>