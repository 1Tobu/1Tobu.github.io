import { createApp } from 'vue';
import Header from './src/components/Header.vue';
import RatingForm from './src/components/RatingForm.vue';
import RatingsList from './src/components/RatingsList.vue';
import LoginModal from './src/components/LoginModal.vue';
import RegisterModal from './src/components/RegisterModal.vue';

createApp({
    components: {
        Header,
        RatingForm,
        RatingsList,
        LoginModal,
        RegisterModal
    },
    data() {
        return {
            ratings: [],
            showLoginModal: false,
            showRegisterModal: false
        };
    },
    methods: {
        addRating(newRating) {
            this.ratings.push(newRating);
        },
        showLogin() {
            this.showLoginModal = true;
            this.showRegisterModal = false;
        },
        showRegister() {
            this.showRegisterModal = true;
            this.showLoginModal = false;
        },
        closeModal() {
            this.showLoginModal = false;
            this.showRegisterModal = false;
        }
    },
    template: `
        <div>
            <Header @show-login="showLogin" @show-register="showRegister" />
            <RatingForm @add-rating="addRating" />
            <RatingsList :ratings="ratings" />
            <LoginModal v-if="showLoginModal" @close="closeModal" />
            <RegisterModal v-if="showRegisterModal" @close="closeModal" />
        </div>
    `
}).mount('#app');
