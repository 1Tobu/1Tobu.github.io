<template>
  <RecipeItem/>
  <RecipeItem/>
  <RecipeItem/>
  <RecipeItem/>
  <RecipeItem/>
</template>

<script>
import RecipeItem from '@/components/RecipeItem.vue'
export default {
    components: {
        RecipeItem
    },
    data() {
        recipes: []
    }
}
</script>
