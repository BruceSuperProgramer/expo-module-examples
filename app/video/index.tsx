import { useState } from "react";
import { Text } from "react-native";
import { SafeAreaView } from "react-native-safe-area-context";
import { ExpoVideoView } from "../../modules/expo-video";
import Button from "../components/Button";
import { VIDEO } from "./constants";

const VideoScreen = () => {
  const [videoUrl, setVideoUrl] = useState(VIDEO.ONE);

  const btnClassName = "w-80 h-20 self-center my-3 bg-purple-500";

  return (
    <SafeAreaView style={{ flex: 1 }}>
      <ExpoVideoView style={{ flex: 1 }} url={videoUrl} />
      <Button
        btnClassName={btnClassName}
        onPress={() => setVideoUrl(VIDEO.ONE)}
      >
        <Text>Video One</Text>
      </Button>
      <Button
        btnClassName={btnClassName}
        onPress={() => setVideoUrl(VIDEO.TWO)}
      >
        <Text>Video Two</Text>
      </Button>
      <Button
        btnClassName={btnClassName}
        onPress={() => setVideoUrl(VIDEO.THREE)}
      >
        <Text>Video Three</Text>
      </Button>
    </SafeAreaView>
  );
};

export default VideoScreen;
