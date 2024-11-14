const { createApp } = Vue;

createApp({
    data() {
        return {
            newName: '',
            newRating: 1,
            ratings: []
        };
    },
    methods: {
        addRating() {
            if (this.newName && this.newRating >= 1 && this.newRating <= 5) {
                this.ratings.push({
                    name: this.newName,
                    stars: this.newRating
                });
                this.newName = '';
                this.newRating = 1;
            } else {
                alert("Bitte einen Namen und eine Bewertung zwischen 1 und 5 eingeben.");
            }
        }
    }
}).mount('#app');
