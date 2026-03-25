<template>
  <div style="display: flex; gap: 10px; margin-top: 20px">
    <GalleryListItem
      v-for="img in images"
      :key="img.id"
      :image="img"
      @select="selectImage"
      :selectId="selectId"
    />
  </div>
</template>
<script>
import GalleryListItem from './GalleryListItem.vue';

export default {
  components: { GalleryListItem },
  props: ['images', 'selectId'],
  methods: {
    selectImage(image) {
      this.$emit('change-image', image);
    },
  },
};
</script>
