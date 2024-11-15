const app = Vue.createApp({
    template: `<h1>Hallo LOL: {{ name }}</h1>
    <img :src="myImage">
    <button v-on:click="getNewImage()">Klick mich!</button>
    `,
    data() {
        return {
            name: 'Tobias',
            myImage: 'https://random.imagecdn.app/500/150'
        }
    },
    methods: {
        getNewImage() {
            const width = Math.floor(Math.random() * 500);

            this.myImage = `https://random.imagecdn.app/${width}/250`;
        }
    }
});

app.mount('#app');