import Vue from 'vue'
import VueRouter from 'vue-router'
// @는 현재 src 폴더를 의미함
import VueDataBindingPage from '@/views/basics/binding/VueDataBindingPage.vue'
import VueClickEventPage from '@/views/basics/event/VueClickEventPage.vue'
import VueInputEventPage from '@/views/basics/event/VueInputEventPage.vue'

import DuplexWithModelPage from '@/views/basics/vModel/DuplexWithModelPage'
import VueCheckboxPage from '@/views/basics/vModel/VueCheckboxPage.vue'
import VueMultiCheckboxPage from '@/views/basics/vModel/VueMultiCheckboxPage.vue'

Vue.use(VueRouter)

const vueBasicRoutes = [
    {
        path: '/vue-data-binding-page',
        name: 'VueDataBindingPage',
        component: VueDataBindingPage
    },
    {
        path: '/vue-click-event-page',
        name: 'VueClickEventPage',
        component: VueClickEventPage
    },
    {
        path: '/vue-input-event-page',
        name: 'VueInputEventPage',
        component: VueInputEventPage
    },
    {
        path: '/duplex-model-test-page',
        name: 'DuplexWithModelPage',
        component: DuplexWithModelPage
    },
    {
        path: '/vue-checkbox-page',
        name: 'VueCheckboxPage',
        component: VueCheckboxPage
    },
    {
        path: '/vue-multi-checkbox-page',
        name: 'VueMultiCheckboxPage',
        component: VueMultiCheckboxPage
    },
]

export default vueBasicRoutes