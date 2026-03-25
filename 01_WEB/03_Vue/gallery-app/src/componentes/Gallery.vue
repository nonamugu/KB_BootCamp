<template>
  <div>
    <GalleryBig :selectedImage="selectedImage.url" />
    <GalleryList
      :selectId="selectedImage.id"
      :images="images"
      @change-image="changeImage"
    />
  </div>
</template>
<script>
import GalleryBig from './GalleryBig.vue';
import GalleryList from './GalleryList.vue';

export default {
  components: { GalleryBig, GalleryList },
  data() {
    return {
      images: [
        { id: 'img01', url: '/images/dog1.jpg' },
        { id: 'img02', url: '/images/dog2.jpg' },
        { id: 'img03', url: '/images/dog3.jpg' },
        { id: 'img04', url: '/images/dog4.jpg' },
        { id: 'img05', url: '/images/dog5.jpg' },
      ],
      selectedImage: { id: 'img01', url: '/images/dog1.jpg' },
    };
  },
  methods: {
    changeImage(image) {
      this.selectedImage = image;
    },
  },
};
</script>
