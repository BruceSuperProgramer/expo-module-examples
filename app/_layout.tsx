import { Stack } from "expo-router";

export default function RootLayout() {
  return (
    <Stack>
      <Stack.Screen name="index" options={{ title: "Home" }} />
      <Stack.Screen
        name="nativelist/index"
        options={{ title: "Native List" }}
      />
      <Stack.Screen name="chart/index" options={{ title: "Native Chart" }} />
      <Stack.Screen name="video/index" options={{ title: "Video Streaming" }} />
    </Stack>
  );
}
