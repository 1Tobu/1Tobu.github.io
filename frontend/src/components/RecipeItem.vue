<template>
    <div class="recipeItemContainer">
        <img class="recipe-image" :src="image"/>
        <div class="right-side">
            <div>
                {{ label }}
            </div>
            <div class="bottom-row">
                {{ attributes }}
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        name: 'RecipeItem',
        data() {
            return {
                image: 'https://random.imagecdn.app/500/150',
                label: 'Erstes Label',
                attributes: 'Teuer, Billig'
            };
        }
    }
</script>

<style scoped>
.recipeItemContainer {
    border: 1px solid rgba(0,0,0,0.2);
    padding: 16px;
    border-radius: 8px;
    margin: 8px;
    display: flex;
    gap: 8px;
}
.recipeItemContainer:hover {
    background-color: rgba(0,0,0,0.05);
}
.recipe-image {
    height: 50px;
    width: 50px;
    border-radius: 10px;
}
.right-side {
    display: flex;
    flex-direction: column;
    gap: 10px;
}
.bottom-row {
    color: rgba(0,0,0,0.4);
    font-size: 20px;
}
</style>