<template>
    <div class="ratings-list">
        <h2>Bewertungen</h2>
        <ul>
            <li v-for="(rating, index) in ratings" :key="index">
                <strong>{{ rating.name }}</strong>: {{ rating.stars }} Sterne
            </li>
        </ul>
    </div>
</template>

<script>
export default {
    props: ['ratings']
};
</script>
