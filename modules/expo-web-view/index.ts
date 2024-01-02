// Import the native module. On web, it will be resolved to ExpoWebView.web.ts
// and on native platforms to ExpoWebView.ts
import ExpoWebView from "./src/ExpoWebView";
import { ChangeEventPayload, ExpoWebViewProps } from "./src/ExpoWebView.types";

export { ChangeEventPayload, ExpoWebView, ExpoWebViewProps };
